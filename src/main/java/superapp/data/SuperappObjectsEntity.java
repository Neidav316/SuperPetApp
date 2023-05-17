package superapp.data;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SuperappObjects")
public class SuperappObjectsEntity {
	@Id
	private String objectId;
    private String type;
    private String alias;
    private boolean active;
    private Date creationTimestamp;
    private double lat;
    private double lng;
    private String byEmail;
    private String bySuperapp;
    private Map<String, Object> objectDetails;

	@DBRef(lazy = true)
	private Set<SuperappObjectsEntity> children;

	@DBRef(lazy = true)
	private Set<SuperappObjectsEntity> parents;
	
	public SuperappObjectsEntity() {	
		this.objectDetails = new TreeMap<>();
		this.children = new HashSet<>();
		this.parents = new HashSet<>();
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getObjectSuperapp() { return objectId.split("/")[0];}

	public String getObjectInternalId() { return objectId.split("/")[1];}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getByEmail() {
		return byEmail;
	}

	public void setByEmail(String byEmail) {
		this.byEmail = byEmail;
	}
	
	public String getBySuperapp() {
		return bySuperapp;
	}

	public void setBySuperapp(String bySuperapp) {
		this.bySuperapp = bySuperapp;
	}

	public Map<String, Object> getObjectDetails() {
		return objectDetails;
	}

	public void setObjectDetails(Map<String, Object> objectDetails) {
		this.objectDetails = objectDetails;
	}

	public Set<SuperappObjectsEntity> getChildren() {
		return children;
	}

	public void setChildren(Set<SuperappObjectsEntity> children) {
		this.children = children;
	}

	public Set<SuperappObjectsEntity> getParents() {
		return parents;
	}

	public void setParents(Set<SuperappObjectsEntity> parents) {
		this.parents = parents;
	}

	public void addChild(SuperappObjectsEntity child){
		this.children.add(child);
	}
	public void addParent(SuperappObjectsEntity parent){	this.parents.add(parent);}

	@Override
	public int hashCode() {
		return Objects.hash(objectId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		SuperappObjectsEntity other = (SuperappObjectsEntity) obj;
		return Objects.equals(objectId, other.objectId);
	}

	@Override
	public String toString() {
		return "SuperappObjectsEntity [objectId=" + objectId + ", type="
				+ type + ", alias=" + alias + ", active=" + active + ", creationTimestamp=" + creationTimestamp
				+ ", lat=" + lat + ", lng=" + lng + ", createdBy=" + byEmail + bySuperapp + ", objectDetails=" + objectDetails
				+ "]";
	}


}
