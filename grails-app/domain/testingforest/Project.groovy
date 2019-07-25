package testingforest

class Project {

    String projectName
    Date dateCreated
    Date lastUpdated

    static hasMany = [teamList: User, testCaseList: TestCase]

    static constraints = {
        projectName size: 1..255
        testCaseList nullable: true
    }
}
