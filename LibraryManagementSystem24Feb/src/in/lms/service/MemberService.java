package in.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lms.model.Member;
import in.lms.repository.MemberRepository;

@Service
public class MemberService {
	
	MemberRepository memberRepo;
	@Autowired
	public MemberService(MemberRepository memberRepo){
		this.memberRepo = memberRepo;
	}
	
	public void registerMember(int id,String name,String email) {
		memberRepo.addMember(new Member(id,name,email));	
	}
	
	
	public Member getMemberById(int id) {
		return memberRepo.memberById(id);
	}

	
}

