package _09_interface_examples.teacher;

class TrainingCompany {

    public static void main(String[] args) {
        // Reference variable type could be Interface
        ITeacher liveOne = new Trainer();
        ITeacher remoteOne = new OnlineTutorial();

        // Method argument type could be Interface type
        Trainer liveOne2 = new Trainer();
        beginClass("Java", liveOne2);
        SubTrainer subTrainer = new SubTrainer();
        // Is SubTrainer object IS a Teacher?
        beginClass("Python", subTrainer);
        endClass("Java", liveOne2);

        // Interface type is used as a return type
        ITeacher ITeacher = getTeacher();

        // Exercise involving IHighSchoolTeacher interface
        RetiredProfessional retiredProfessional = new RetiredProfessional();
        retiredProfessional.myDefaultMethod();

        IHighSchoolTeacher iHighSchoolTeacher = new RetiredProfessional();
        IGolfer iGolfer = new RetiredProfessional();
        iGolfer.myDefaultMethod();
    }

    // Is this method going to provide polymorphic behavior?
    public static void beginClass(String courseTitle,
                                  ITeacher ITeacher) {
        ITeacher.teach("Java");
        ITeacher.gradeHW();
    }

    // Is this method going to provide polymorphic behavior?
    public static void endClass(String courseTitle,
                                Trainer trainer) {
        trainer.teach("Java");
        trainer.gradeHW();
    }

    public static void endClass(String courseTitle,
                                OnlineTutorial onlineTutorial) {
        onlineTutorial.teach("Java");
        onlineTutorial.gradeHW();
    }

    public static ITeacher getTeacher() {
        return new OnlineTutorial();
    }
}
