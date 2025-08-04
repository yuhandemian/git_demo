package ex01.parsing.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoxOffice {
	private Integer rnum;             // 순위 번호
	private Integer rank;             // 순위
	private Integer rankInten;        // 순위 변동
	private String 	rankOldAndNew;     // 순위 OLD or NEW
	private String 	movieCd;           // 영화 코드
	private String 	movieNm;           // 영화명
	private String 	openDt;            // 개봉일
	private Long 	salesAmt;            // 매출 금액
	private Double 	salesShare;        // 매출 점유율
	private Long 	salesInten;          // 매출 변동 금액
	private Double 	salesChange;       // 매출 변동율
	private Long 	salesAcc;            // 누적 매출 금액
	private Long 	audiCnt;             // 관객 수
	private Long 	audiInten;           // 관객 수 변동
	private Double 	audiChange;        // 관객 수 변동율
	private Long 	audiAcc;             // 누적 관객 수
	private Long 	scrnCnt;             // 상영관 수
	private Long 	showCnt;             // 상영 횟수
}