package com.mavericks.scanpro.repositories;

import com.mavericks.scanpro.entities.Address;
import com.mavericks.scanpro.entities.Scanned_files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addressRepo extends JpaRepository<Address,Long> {
}
