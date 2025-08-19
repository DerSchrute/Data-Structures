public class history {
    private String url;
    public history next;

    //constructor!!!
    public history() {
        this.url = "";
        this.next = null;
    }

    public history(String url) {
        this.url = url;
        this.next = null;
    }
    public history(String url, history next) {
        this.url = url;
        this.next = next;
    }
    public void setUrl(String url) {
        //validation
        this.url = url;
    }
        //formatting    
    public String getUrl() {
        return url;
    }

}