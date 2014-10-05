package data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Run {
    private int RunId;
    private Business business;
    private User host;
    private Map<User, Order> participants;
    private Date endTime;

    public Run(User host, Business business, Date endTime) {
        this.host = host;
        this.business = business;
        this.endTime = endTime;
        this.participants = new HashMap<User, Order>();
    }

    public void addParticipant(User user, Order order) {
        participants.put(user, order);
    }
}
