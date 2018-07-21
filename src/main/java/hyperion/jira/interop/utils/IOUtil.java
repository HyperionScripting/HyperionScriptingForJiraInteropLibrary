package hyperion.jira.interop.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class IOUtil {
    public static String getFileContent(Class<?> clazz, String path) throws IOException {
        InputStream inputStream = clazz.getClassLoader().getResourceAsStream(path);
        if (inputStream != null) {
            return IOUtils.toString(clazz.getClassLoader().getResourceAsStream(path), "UTF-8");
        } else {
            throw new IOException("Path not accessible: "+path);
        }
    }
}
