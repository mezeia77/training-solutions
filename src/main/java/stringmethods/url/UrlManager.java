package stringmethods.url;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public UrlManager(String url) {
        this.protocol = getProtocolFromUrl(url);
        this.port = getPortFromUrl(url);
        this.host = getHostFromUrl(url);
        this.path = getPathFromUrl(url);
        this.query = getQueryFromUrl(url);
    }

    public boolean hasProperty(String key) {
        validateString(key);
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        validateString(key);
        String[] properties = query.split("&");
        for (String str : properties) {
            String[] prop = str.split("=");
            if (prop[0].equals(key)) {
                return prop[1];
            }
        }
        return null;
    }

    private static String getProtocolFromUrl(String url) {
        int colonPosition = url.indexOf(":");
        if (!validateUrl(url)) {
            throw new IllegalArgumentException("Invalid URL!");
        }
        return url.toLowerCase().substring(0, colonPosition);
    }

    private static String getHostFromUrl(String url) {
        int thirdSlashPosition = url.indexOf("/", 8);
        int protocolHostBorderPosition = url.indexOf("://");
        int secondColonPosition = url.indexOf(":", 8);
        if (!validateUrl(url)) {
            throw new IllegalArgumentException("Invalid URL!");
        }
        if (secondColonPosition == -1){
            return url.toLowerCase().substring(protocolHostBorderPosition+3, thirdSlashPosition);
        }
        return url.toLowerCase().substring(protocolHostBorderPosition+3, secondColonPosition);
    }

    private static Integer getPortFromUrl(String url) {
        int secondColonPosition = url.indexOf(":", 8);
        int thirdSlashPosition = url.indexOf("/", 8);
        if (secondColonPosition == -1){
            return null;
        }
        if (thirdSlashPosition != -1){
            return Integer.valueOf(url.substring(secondColonPosition+1, thirdSlashPosition));
        }
        return Integer.valueOf(url.substring(secondColonPosition+1));
    }

    private static String getPathFromUrl(String url) {
        int thirdSlashPosition = url.indexOf("/", 8);
        int questionMarkPosition = url.indexOf("?");
        if (thirdSlashPosition == -1 || questionMarkPosition == -1){
            return "";
        }

        return url.substring(thirdSlashPosition, questionMarkPosition);
    }

    private static String getQueryFromUrl(String url) {
        int questionMarkPosition = url.indexOf("?");
        if (questionMarkPosition == -1){
            return "";
        }
        return url.substring(questionMarkPosition+1);
    }

    private void validateString(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Parameter must not be empty");
        }
    }

    private static boolean validateUrl(String url) {
        int protocolHostBorderPosition = url.indexOf("://");
        if (protocolHostBorderPosition == -1){
            return false;
        }
        return true;
    }


public static void main(String[] args) {
        String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

    System.out.println("Protocol: " + getProtocolFromUrl(url));
    System.out.println("Host: " + getHostFromUrl(url));
    System.out.println("Path: " + getPathFromUrl(url));
    System.out.println("Query: " + getQueryFromUrl(url));
    System.out.println("Port: " + getPortFromUrl(url));
    }

}

