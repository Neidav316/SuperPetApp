package superapp.bounderies;

public class CommandId {
    private String superapp;
    private String miniapp;
    private String internalCommandId;

    public CommandId(String superapp, String miniapp, String internalCommandId) {
        this.superapp = superapp;
        this.miniapp = miniapp;
        this.internalCommandId = internalCommandId;
    }
    public CommandId(String miniapp, String internalCommandId) {
        this.miniapp = miniapp;
        this.internalCommandId = internalCommandId;
    }
    public CommandId(String miniapp) { this.miniapp = miniapp;}

    public CommandId() {   }

    public String getSuperapp() {
        return superapp;
    }

    public void setSuperapp(String superapp) {
        this.superapp = superapp;
    }

    public String getMiniapp() {
        return miniapp;
    }

    public void setMiniapp(String miniapp) {
        this.miniapp = miniapp;
    }

    public String getInternalCommandId() {
        return internalCommandId;
    }

    public void setInternalCommandId(String internalCommandId) {
        this.internalCommandId = internalCommandId;
    }

    @Override
    public String toString() {
        return  "superapp='" + (superapp!=null ? superapp : "null") + '\'' +
                ", miniapp='" + (miniapp!=null ? miniapp : "null") + '\'' +
                ", internalCommandId='" + (internalCommandId!=null ? internalCommandId : "null") + '\'';
    }
}
