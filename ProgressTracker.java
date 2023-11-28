package mentalhealth.Interfaces;

public interface ProgressTracker {
    void recordProgress();
    void recordProgress(String progressNote);
    void recordProgress(String progressNote, int happinessLevel);
}
