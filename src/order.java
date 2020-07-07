import java.util.Date;

public class order {
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public  order() {}

	public order(Integer id, Date moment, OrderStatus status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	

}
