package Exercise_3;

public class OnlineStudent extends Student {
    String zoom_id;

    OnlineStudent( String name, String student_id, String  zoom_id){
        super(name, student_id);
        this.zoom_id = zoom_id;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + student_id);
        System.out.println("Zoom ID: " + zoom_id);
    }
}
