package org.mgang.urlcheck.proputil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

/**
 */
public class UrlCheckJarConfig extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 配置文件地址
	 */
	private static final String FILE_PATH_KEY = "urlcheckjar.properties";
	private static UrlCheckJarConfig appcnfgProp = null;
	private static boolean inited = false;
	
	private UrlCheckJarConfig() {
		
	};

	/**
	 * 获取配置单例
	 * @return
	 * @throws IOException
	 */
	private static UrlCheckJarConfig getInstance(boolean forceload) {
		// 同步化操作，避免多个线程争用资源，同时初始化配置。
		if (forceload ==true){
			inited = false;
		}
		synchronized (UrlCheckJarConfig.class) {
			if (!inited) {
				appcnfgProp = new UrlCheckJarConfig();
				try {
					URL url = UrlCheckJarConfig.class.getClassLoader()
							.getResource(FILE_PATH_KEY);
					File confFile = new File(url.toURI());
					appcnfgProp.load(new FileInputStream(confFile));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					return appcnfgProp;
				} catch (IOException e) {
					e.printStackTrace();
					return appcnfgProp;
				} catch (URISyntaxException e) {
					e.printStackTrace();
					return appcnfgProp;
				}
				inited = true;
			}
		}

		return appcnfgProp;
	}

	/**
	 * 读取key对应的value
	 * @param key
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String get(String key) throws UnsupportedEncodingException {
		return iso885912utf8(getInstance(false).getProperty(key));
	}
	private static String iso885912utf8(String value) throws UnsupportedEncodingException{
		return new String(value.getBytes("ISO-8859-1"), "UTF-8");
	}
	/**
	 * 读取key对应的value，空则返回 defaultvalue
	 * @return
	 */
	public static String get_default(String key,String defaultvalue) {
		String s = getInstance(false).getProperty(key);
		if (s==null){
			return defaultvalue;
		}else{
			return s;
		}
	}
	
	/**
	 * 强制重新读取一次properties文件，然后读取key对应的value
	 * 
	 * @param key
	 * @return
	 */
	public static String load_get(String key) {
		return getInstance(true).getProperty(key);
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(UrlCheckJarConfig.get("user_class"));
	}
}
