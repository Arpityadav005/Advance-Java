package in.lms.repository;

import in.lms.model.Member;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
	
	private List<Member> memberList = new ArrayList<>();
	
	public void addMember(Member member){
		
		memberList.add(member);
	}
	
	public Member memberById(int id) {
		for(Member member: memberList) {
			if(member.getId() == id) {
				return member;
			}
		}
		return null;
	}
	
	public List<Member> allMember(){
		
		return memberList;
	}

}
