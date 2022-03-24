package ma.mihradi.jpaap.repositories;

import ma.mihradi.jpaap.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository <Patient ,Long > {
    public List<Patient> findByMalade(boolean m );
    public Page<Patient> findByMalade(boolean m , Pageable pageable);
    public List<Patient> findByMaladeAndScoreLessThan(boolean m , int score );
    public List<Patient> findByMaladeIsTrueAndScoreLessThan(int s);
    public List<Patient> findByDateNaissanceBetween(Date d1, Date d2);
}
