package com.mavericks.scanpro.repositories;

import com.mavericks.scanpro.entities.Github_files;
import com.mavericks.scanpro.entities.Scanned_files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GithubFileRepo extends JpaRepository<Github_files,Long> {
}
