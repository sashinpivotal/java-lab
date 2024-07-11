package _11_interface.teacher_example;

class RetiredProfessional
        implements IHighSchoolTeacher, IGolfer {

    @Override
    public void teach(String subject) {

    }

    @Override
    public double gradeHomework() {
        return 0;
    }

    @Override
    public void motivate() {

    }

    @Override
    public void playGolf() {

    }

}
