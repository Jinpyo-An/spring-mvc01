package hello.springservlet.web.frontcontroller.v3.controller;

import hello.springservlet.domain.member.Member;
import hello.springservlet.domain.member.MemberRepository;
import hello.springservlet.web.frontcontroller.ModelView;
import hello.springservlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        final String username = paramMap.get("username");
        final int age = Integer.parseInt(paramMap.get("age"));

        final Member member = new Member(username, age);
        memberRepository.save(member);

        final ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
