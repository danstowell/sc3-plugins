FFTTriggered : UGen 
{
	*new { arg buffer, in = 0.0, trig = 0.0, maxoverlap = 0.5;
		^this.multiNew('control', buffer, in, trig, maxoverlap)
	}
}	

FFTInterleave : UGen
{
	*new { arg chain1, chain2; 
		^this.multiNew('control', chain1, chain2)
	}
}