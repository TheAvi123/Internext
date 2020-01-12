import static spark.Spark.get;

public class Receiver {

    public Receiver() {
        respond();
    }

    public void respond() {
        get("/", (req, res) -> "Hello Web");
/*
        post("/sms", (req, res) -> {
            res.type("application/xml");
            Body body = new Body
                    .Builder("The Robots are coming! Head for the hills!")
                    .build();
            Message sms = new Message
                    .Builder()
                    .body(body)
                    .build();
            MessagingResponse twiml = new MessagingResponse
                    .Builder()
                    .message(sms)
                    .build();
            return twiml.toXml();
        });
*/
    }
}