package interviewapp

class Role {

    String authority

    static constraints = {
        authority nullable: false, unique: true
    }
}
