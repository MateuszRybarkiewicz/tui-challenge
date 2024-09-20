package tui.service;

import lombok.Builder;

import java.util.Set;

@Builder
public record UserRepos (String username, Set<Branch> branches){}