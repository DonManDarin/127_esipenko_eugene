package task;
import java.util.HashMap;

public class WebAddressParser {

    private final HashMap<String, String> parameters = new HashMap<>();
    private String login;
    private String password;
    private String scheme;
    private String host;
    private String port;
    private String url;
    private String fragment;

    public WebAddressParser(String address) {
        if (address.contains("://")  && address.contains(".")) {
            String[] str = address.split("://");
            scheme = str[0];
            address = str[1];
            if (address.contains("@")) {
                str = address.split("@");
                password = str[0];
                address = str[1];
            }
            if (password != null){
                String[] str1 = password.split(":");
                login = str1[0];
                password = str1[1];
            }
            if (address.contains("/")) {
                str = address.split("/", 2);
                host = str[0];
                address = str[1];
            }
            if(host != null && host.contains(":")) {
                String[] str2 = host.split(":");
                port = str2[1];
                host = str2[0];
            }
            if (address.contains("#")){
                str = address.split("#");
                fragment = str[1];
                address = str[0];
            }
            url = address;
            if (address.contains("?")){
                str = address.split("\\?");
                url = str[0];
                address = str[1];
            }
            if (address.contains("=")){
                str = address.split("&");
                for (String s : str) {
                    String[] str3 = s.split("=");
                    parameters.put(str3[0], str3[1]);
                }
            }
        }
    }

    public boolean isValid() {
        return !(scheme == null && host == null);
    }

    public String getLogin() {
        if (isValid() && login != null) {
            return login;
        }
        else return "";
    }
    public String getPassword(){
        if (isValid() && password != null) {
            return password;
        }
        else return "";
    }
    public String getScheme(){
        if (isValid()) {
            return scheme;
        }
        else return "";
    }
    public String getHost(){
        if (isValid()) {
            return host;
        }
        else return "";
    }
    public String getPort(){
        if (isValid() && port != null) {
            return port;
        }
        else return "";
    }
    public String getUrl(){
        if (isValid() && url != null) {
            return url;
        }
        else return "";
    }
    public String getFragment(){
        if (isValid() && fragment != null) {
            return fragment;
        }
        else return "";
    }
    public HashMap<String, String> getParameters(){
        return parameters;
    }
}
