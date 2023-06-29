package year3.commercialsite.test;

public class test {
    private String id;
    private String text;

    public test(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "test{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

