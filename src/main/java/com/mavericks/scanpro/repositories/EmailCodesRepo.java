package com.mavericks.scanpro.repositories;

import com.mavericks.scanpro.entities.Email_codes;
import com.mavericks.scanpro.entities.Scanned_files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailCodesRepo extends JpaRepository<Email_codes,Long> {
}
