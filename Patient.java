package mentalhealth;
import mentalhealth.Interfaces.Diagnosis;
import mentalhealth.Interfaces.ProgressTracker;

public class Patient implements Diagnosis, ProgressTracker {
    // Data members
    private String name;
    private int age;
    private String diagnosis;



    // Constructors...
    Patient(){
        this.name="";
        this.age=0;
        this.diagnosis="Unknown";
    }

    Patient(String name,int age){
        this.name=name;
        this.age=age;
        this.diagnosis="No diagnosis";
    }

    Patient(String name,int age,String diagnosis){
        this.name=name;
        this.age=age;
        this.diagnosis=diagnosis;
    }

    // Methods from Diagnosis interface
    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String getDiagnosis() {
        return diagnosis;
    }

    // Methods from ProgressTracker interface
    @Override
    public void recordProgress() {
        System.out.println("Patient " + name + " is making progress.");
    }

    @Override
    public void recordProgress(String progressNote) {
        System.out.println("Progress note for " + name + ": " + progressNote);
    }

    @Override
    public void recordProgress(String progressNote, int happinessLevel) {
        System.out.println("Progress note for " + name + ": " + progressNote);
        System.out.println("Happiness Level: " + happinessLevel);
    }

    // Main method demonstrating the usage of interfaces
    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("Alice", 30);
        Patient patient3 = new Patient("Bob", 25, "Anxiety");

        // Using Diagnosis interface methods
        patient1.setDiagnosis("Depression");

        // Using ProgressTracker interface methods
        patient1.recordProgress();
        patient2.recordProgress("Patient is feeling better.");
        patient3.recordProgress("Patient is in a good mental stage after the treatment he can handle his anxiety efficiently.", 80);
    }
}