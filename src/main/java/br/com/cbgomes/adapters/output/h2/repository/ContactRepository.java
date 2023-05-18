package br.com.cbgomes.adapters.output.h2.repository;

import br.com.cbgomes.adapters.output.h2.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}
