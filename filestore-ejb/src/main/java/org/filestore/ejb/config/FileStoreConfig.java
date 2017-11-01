package org.filestore.ejb.config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStoreConfig {
	
	private static Path home = null;
	static {
		if ( System.getenv("FILESTORE_HOME") != null ) {
	    	home = Paths.get(System.getenv("FILESTORE_HOME"));
	    } else if ( System.getProperty("filestoreHome") != null ) {
	    	home = Paths.get(System.getProperty("filestoreHome"));
	    } else {
	    	home = Paths.get(System.getProperty("user.home"), ".filestore");
	    }
	}
	
	public static Path getHome() {
		return home;
	}

}
