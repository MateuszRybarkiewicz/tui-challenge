package tui.service;

import lombok.Builder;

@Builder
public record Branch(String name, String lastCommitSha) {
}
