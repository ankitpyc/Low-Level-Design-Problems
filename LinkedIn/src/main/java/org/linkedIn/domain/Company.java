package org.linkedIn.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Company {
    private String CompanyId;
    private String CompanyName;
    private List<JobPostings> jobPostingsList;
}
