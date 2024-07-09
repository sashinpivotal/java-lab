package _09_interface.teacher;

class RetiredProfessional
        implements IHighSchoolTeacher, IGolfer {

    @Override
    public void teach(String subject) {

    }

    @Override
    public double gradeHW() {
        return 0;
    }

    @Override
    public void motivate() {

    }

    @Override
    public void playGolf() {

    }

}
