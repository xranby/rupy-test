import se.rupy.http.*;
public class Hello extends Service {
    public String path() { return "/"; }
    public void filter(Event event) throws Event, Exception {
        event.output().print("hello");
    }
}
