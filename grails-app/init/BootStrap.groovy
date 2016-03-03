import interviewapp.Role

class BootStrap {

    def init = { servletContext ->
        Role.findOrSaveWhere(authority: 'ADMIN')
        Role.findOrSaveWhere(authority: 'EMPLOYEE')
    }
    def destroy = {
    }
}
