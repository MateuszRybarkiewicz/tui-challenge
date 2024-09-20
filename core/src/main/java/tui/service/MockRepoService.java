package tui.service;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
class MockRepoService implements RepoService {
    @Override
    public UserRepos getUsersRepos(String username) {
        HashSet<Branch> branches = Sets.newHashSet();
        branches.add(
                Branch.builder()
                        .name("branch1")
                        .lastCommitSha("sha1")
                        .build()
        );
        branches.add(
                Branch.builder()
                        .name("branch2")
                        .lastCommitSha("sha2")
                        .build()
        );
        return UserRepos.builder()
                .username("foo")
                .branches(branches)
                .build();
    }
}
