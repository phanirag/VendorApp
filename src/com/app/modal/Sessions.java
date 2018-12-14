package com.app.modal;

import java.util.Date;

import javax.persistence.*;

/*@Entity
@Table(name="sessiontab")*/
public class Sessions {

	@Temporal(TemporalType.DATE)	
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date time;
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;
	
	public Sessions() {
		super();
	}

	public Sessions(Date date, Date time, Date datetime) {
		this.date = date;
		this.time = time;
		this.datetime = datetime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "Sessions [date=" + date + ", time=" + time + ", datetime="
				+ datetime + "]";
	}
	
	
}
