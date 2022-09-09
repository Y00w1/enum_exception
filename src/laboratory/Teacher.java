package laboratory;

public class Teacher {
    private String id;
    private String name;
    private String subject;
    private Monitor monitor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teacher(String id, String name, String subject, Monitor monitor) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.monitor = monitor;
    }
}
