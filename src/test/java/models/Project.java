package models;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Project {
    private String name;
    private String announcement;
    private  int type;
    private boolean showAnnouncement;
    private boolean deleted;
}
