package es.teldavega.responses;

public class Permissions {
    private boolean admin;
    private Boolean maintain;
    private boolean pull;
    private boolean push;
    private Boolean triage;

    public boolean getAdmin() { return admin; }
    public void setAdmin(boolean value) { this.admin = value; }

    public Boolean getMaintain() { return maintain; }
    public void setMaintain(Boolean value) { this.maintain = value; }

    public boolean getPull() { return pull; }
    public void setPull(boolean value) { this.pull = value; }

    public boolean getPush() { return push; }
    public void setPush(boolean value) { this.push = value; }

    public Boolean getTriage() { return triage; }
    public void setTriage(Boolean value) { this.triage = value; }
}
