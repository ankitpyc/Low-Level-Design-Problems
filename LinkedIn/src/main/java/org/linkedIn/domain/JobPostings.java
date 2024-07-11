package org.linkedIn.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobPostings {
    private String jobID;
    private String jobTitle;
    private Company company;
    private Date postedOn;
    private String JobDescription;
    private List<Skills> skillsList;
    private Duration minExp;
}
