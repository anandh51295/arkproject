package com.javasampleapproach.mongodbrestapi.model;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
public class Personal implements Serializable{


    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String preferences;
    private String activeProject;
    private String notification_preferences;

    private Boolean status;
    private Boolean DefectNotification;
    private Boolean page_status;
    private Boolean widget_status;
    private String Dasboard_preferences;
    private String Widgets;
    private String Widgets_name;
    private String icons;
    private int order;
    private String security;
    private String question;
    private String answer;
    private String Projects;
    private String ProjectName;
    private String ActProjectName;
    private String URL;
    private String Description;

    @Override
    public String toString() {
        return String.format("personal:[username="+username+",password="+password+",email="+email+",role="+role+",preferences:[activeProject="+ActProjectName+",notification_preferences:[status="+status+",DefectNotification="+DefectNotification+",page-status="+page_status+"],Dasboard_preferences:[Widgets:[widget_name:["+Widgets_name+"],widget_status:["+widget_status+"],order:["+order+"],icons="+icons+"]]],security:[question="+question+",answer="+answer+"],Projects:[Projectname:["+ProjectName+"],URL:["+URL+"],Description:["+Description+"]]]]");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getActiveProject() {
        return activeProject;
    }

    public void setActiveProject(String activeProject) {
        this.activeProject = activeProject;
    }

    public String getNotification_preferences() {
        return notification_preferences;
    }

    public void setNotification_preferences(String notification_preferences) {
        this.notification_preferences = notification_preferences;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getDefectNotification() {
        return DefectNotification;
    }

    public void setDefectNotification(Boolean defectNotification) {
        DefectNotification = defectNotification;
    }

    public Boolean getPage_status() {
        return page_status;
    }

    public void setPage_status(Boolean page_status) {
        this.page_status = page_status;
    }

    public Boolean getWidget_status() {
        return widget_status;
    }

    public void setWidget_status(Boolean widget_status) {
        this.widget_status = widget_status;
    }

    public String getDasboard_preferences() {
        return Dasboard_preferences;
    }

    public void setDasboard_preferences(String dasboard_preferences) {
        Dasboard_preferences = dasboard_preferences;
    }

    public String getWidgets() {
        return Widgets;
    }

    public void setWidgets(String widgets) {
        Widgets = widgets;
    }

    public String getWidgets_name() {
        return Widgets_name;
    }

    public void setWidgets_name(String widgets_name) {
        Widgets_name = widgets_name;
    }

    public String getIcons() {
        return icons;
    }

    public void setIcons(String icons) {
        this.icons = icons;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getProjects() {
        return Projects;
    }

    public void setProjects(String projects) {
        Projects = projects;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getActProjectName() {
        return ActProjectName;
    }

    public void setActProjectName(String actProjectName) {
        ActProjectName = actProjectName;
    }
}
