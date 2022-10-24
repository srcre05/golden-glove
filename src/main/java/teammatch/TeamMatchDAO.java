package teammatch;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import soldier.SoldierDTO;

@Mapper
@Repository("teammatchdao")
public interface TeamMatchDAO {

	// 매치 등록

	int insertTeamMatch(TeamMatchDTO dto);
	
	List<SoldierDTO> getSoldierList(String teamName);
	

	// 매치 검색 > 지역별 조회

	List<TeamMatchDTO> getTeamMatchList(String region, String possibleDate);

	// 매치 검색 > 전체 지역 조회

	List<TeamMatchDTO> getAllTeamMatchList(String possibleDate);
	
	// 매치 신청
	
	int updateAwayName(String awayName, int seq);
	int updateRegistration(int seq);

	// 알림
	int insertAlarm(String homeName, String awayName, String region, String possibleDate, String possibleTime, String homePlace, String alarmDate);
}
