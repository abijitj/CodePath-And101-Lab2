fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
	val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
    
    /* OR
    if(client==null || message == null || client.personalInfo == null || 
            client.personalInfo.email == null) return; 
    
    val email = client.personalInfo.email;
    mailer.sendMessage(email, message)
    */
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}