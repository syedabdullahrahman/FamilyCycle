package FamilyAssistance.kazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KaziService {
	
	@Autowired
	KaziRepository kaziRepository;

	public KaziService() {
	}

	public Kazi getKazi(String license) {

		return kaziRepository.findByKaziLicenceNumber(license);
	}

	public Kazi getKaziByUserNameandPassword(String email,String password){

		return kaziRepository.findByKaziEmailAndKaziPassword(email,password);
	}

	
	public Iterable<Kazi> getAll(){
		return kaziRepository.findAll();
	}

	public String addkazi(Kazi temp) {
        //if (!(getKazi(temp.kaziLicenceNumber).getKaziLicenceNumber().isEmpty() || getKazi(temp.kaziLicenceNumber).getKaziLicenceNumber() == null)) {
        //    return "Kazi Exists";
        //}
		kaziRepository.save(temp);
		return "Success";
	}

	public void updateKazi(Kazi temp,Long id) {

	}

	public void deleteKazi(Kazi temp, Long id) {

	}
}
