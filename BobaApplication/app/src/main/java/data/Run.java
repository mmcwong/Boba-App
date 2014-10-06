package data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Run {
    public final int runId;
    public final Business business;
    public final User host;
    public final Map<User, Order> participants;
    public final Date endTime;

    public Run(User host, Business business, Date endTime) {
        this.runId = 1;
        this.host = host;
        this.business = business;
        this.endTime = endTime;
        this.participants = new HashMap<User, Order>();
    }

    public void addParticipant(User user, Order order) {
        participants.put(user, order);
    }
}
