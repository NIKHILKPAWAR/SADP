public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}



/*
class HeartAdapter implements BeatModelInterface{
 HeartModelInterface heart;
 public HeartAdapter(HeartModelInterface heart) { 
this.heart = heart; }
 public void initialize() {
}
 public void on() {
} 
public void off() {}
 public int getBPM() { 
return heart.getHeartRate(); 
} public void setBPM(int bpm) {}
 public void registerObserver(BeatObserver o) { 
heart.registerObserver(o); 
}
 public void removeObserver(BeatObserver o) {
 heart.removeObserver(o); }
 public void registerObserver(BPMObserver o) { 
heart.registerObserver(o); } 
public void removeObserver(BPMObserver o) {
 heart.removeObserver(o); 
}
}
 class HeartController implements ControllerInterface { 
HeartModelInterface model; 
DJView view; 
public HeartController(HeartModelInterface model) {
 this.model = model; 
view = new DJView(this, new HeartAdapter(model)); 
view.createView(); 
view.createControls(); 
view.disableStopMenuItem(); 
view.disableStartMenuItem(); } 
public void start() {}
 public void stop() {}
 public void increaseBPM() {} 
public void decreaseBPM() {}
 public void setBPM(int bpm) {}
}
 class HeartTestDrive { 
public static void main (String[] args) { 
HeartModel heartModel = new HeartModel();
 ControllerInterface model = new HeartController(heartModel); 
}
}
*/
//https://www.google.co.in/books/edition/Head_First_Design_Patterns/Lw8LEAAAQBAJ?hl=en&gbpv=1&dq=Write+a+java+program+to+implement+Adapter+pattern+to+design+Heart+Model+to+Beat+Model.&pg=PA626&printsec=frontcover
//https://www.academia.edu/29820274/Head_first_design_patterns

