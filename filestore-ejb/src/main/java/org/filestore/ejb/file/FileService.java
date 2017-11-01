package org.filestore.ejb.file;

import org.filestore.ejb.file.entity.FileItem;

import java.util.List;

public interface FileService {
	
	String postFile(String owner, List<String> receivers, String message, String name, String stream) throws FileServiceException;
	
	FileItem getFile(String id) throws FileServiceException;
	
	void deleteFile(String id) throws FileServiceException;

}
