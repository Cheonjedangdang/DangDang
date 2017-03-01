package com.dangdangcompany.dangdang.file.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.dangdangcompany.dangdang.utils.json.SimpleHashMap;

@Controller
public class FileController {
	
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	
	private static final String TEMP_FOLDER = "C:\\Users\\wkdtm\\Desktop\\uploadimg";
	
	@RequestMapping(value="uploadImage", method = RequestMethod.POST)
	@ResponseBody
	public SimpleHashMap uploadImage(MultipartHttpServletRequest request) throws IllegalStateException, IOException {
		
		String fileName = request.getFileNames().next();
		MultipartFile file = request.getFile(fileName);
		
		String originalFileName = file.getOriginalFilename();
		String extension = originalFileName.substring(originalFileName.lastIndexOf("."), originalFileName.length());
		
		String newFileName = UUID.randomUUID().toString().replace("-", "")+extension;
		logger.info("원래 파일명 : {}", originalFileName);
		logger.info("새    파일명 : {}", newFileName);
		
		file.transferTo(new File(TEMP_FOLDER+newFileName));
		
		return SimpleHashMap.newInstance().put("save_url", newFileName);
	}
	
	@RequestMapping("viewImage/{filename:.+}")
	public ResponseEntity<byte[]> viewImage(@PathVariable String filename) throws IOException {
		byte[] data = null;
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_JPEG);
		
		data = IOUtils.toByteArray(new FileInputStream(new File(TEMP_FOLDER + filename)));
		
		return new ResponseEntity<byte[]>(data, headers, HttpStatus.CREATED);
	}
	
}
