//
//  textured_fs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 10/04/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//


precision highp float;

varying vec2 v_TexCoord;
varying vec4 v_Color;

uniform sampler2D   u_Texture;
uniform vec2        u_CircleMaskPoint;
uniform float       u_CircleMaskR;
uniform int         u_UseCircleMask;

void main()
{
    vec4 fragmentColor = v_Color;
    
    if (1 == u_UseCircleMask)
    {
        float x = gl_FragCoord[0];
        float y = gl_FragCoord[1];
        
        float dx = u_CircleMaskPoint[0] - x;
        float dy = u_CircleMaskPoint[1] - y;
        
        float dist      = sqrt(dx * dx + dy * dy);
        float twoPixRel = 2.0 / u_CircleMaskR;
        float alpha     = smoothstep(1.0 - twoPixRel, 1.0, dist / u_CircleMaskR);
        
        fragmentColor.w -= alpha;
    }
    
    gl_FragColor = fragmentColor * texture2D(u_Texture, v_TexCoord);
}
