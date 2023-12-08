class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if((a==b)&&(b==c)&&(c==d)) {
    		answer=1111*a;
    	}else if((a==b)&&(b==c)&&(c!=d)) {
    		answer=((10*a)+d)*((10*a)+d);
    	}else if((a==b)&&(b==d)&&(c!=d)) {
    		answer=((10*a)+c)*((10*a)+c);
    	}else if((a==d)&&(d==c)&&(c!=b)) {
    		answer=((10*a)+b)*((10*a)+b);
    	}else if((d==b)&&(b==c)&&(c!=a)) {
    		answer=((10*c)+a)*((10*c)+a);
    	}else if((a==b)&&(c==d)&&(c!=a)) {
    		answer=(a+c)*(Math.abs(a-c));
    	}else if((a==c)&&(b==d)&&(b!=a)) {
    		answer=(a+b)*(Math.abs(a-b));
    	}else if((a==d)&&(b==c)&&(c!=a)) {
    		answer=(a+c)*(Math.abs(a-c));
    	}else if((a==b)&&(a!=c)&&(d!=a)) {
    		answer=c*d;
    	}else if((a==c)&&(b!=a)&&(d!=a)) {
    		answer=b*d;
    	}else if((a==d)&&(a!=c)&&(b!=a)) {
    		answer=b*c;
    	}else if((b==c)&&(b!=a)&&(c!=d)) {
    		answer=a*d;
    	}else if((b==d)&&(b!=c)&&(b!=a)) {
    		answer=a*c;
    	}else if((c==d)&&(b!=c)&&(c!=a)) {
    		answer=a*b;
    	}else if((a!=b)&&(b!=c)&&(c!=d)&&(d!=a)) {
    		if((a<b)&&(a<c)&&(a<d)) {
    			answer=a;
    		}
    		if((b<a)&&(b<c)&&(b<d)) {
    			answer=b;
    		}
    		if((c<a)&&(c<b)&&(c<d)) {
    			answer=c;
    		}
    		if((d<a)&&(d<b)&&(d<c)) {
    			answer=d;
    		}
    	}
        return answer;
    }
}