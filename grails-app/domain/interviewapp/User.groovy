package interviewapp

class User {

    String name
    String email

    static hasMany = [roles:Role]

    static constraints = {
        name nullable: false
        email email: true, nullable: false
    }
}
