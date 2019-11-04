//
//  smoozy_poly_fs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 14/04/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//

// TODO: Workaround if highp is not supported
precision highp float;

varying vec2 v_CenterCoords;
varying vec4 v_Coeffs;
varying vec4 v_Color;

void main()
{
    float flag = v_Coeffs[2]; // -1.0 - rectangle, else - ordinary line
    
    // TODO: Use epsilon
    //const float epsilon = 0.000001;
    //if (abs(flag + 1.0) <= epsilon) // flag == -1.0
    if (flag < 0.0) // flag == -1.0 means rectangle, else - line
    {
        gl_FragColor = v_Color;
        return;
    }

    float xf = gl_FragCoord[0];
    float yf = gl_FragCoord[1];
    float xi = v_CenterCoords[0];
    float yi = v_CenterCoords[1];
    float sin = v_Coeffs[0];
    float cos = v_Coeffs[1];
    
    float dist = abs((xf - xi) * cos + (yf - yi) * sin);
    
    float halfw     = v_Coeffs[3] / 2.0;
    float distRel   = dist / halfw;
    const float maxGradW  = 0.5;
    float k         = (1.0 - distRel) * max(halfw, maxGradW);
    float opacity   = max(0.0, min(1.0, k));
    
    gl_FragColor = vec4(v_Color.r, v_Color.g, v_Color.b, opacity * v_Color.a);

//    if (dist <= halfw)
//    {
//        gl_FragColor = vec4(v_Color.r, v_Color.g, v_Color.b, opacity * v_Color.a);
//    }
//    else if (dist > halfw + 15.0)
//    {
//        gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);
//    }
//    else if (dist > halfw + 10.0)
//    {
//        gl_FragColor = vec4(0.0, 1.0, 0.0, 1.0);
//    }
//    else if (dist > halfw + 5.0)
//    {
//        gl_FragColor = vec4(0.0, 0.0, 1.0, 1.0);
//    }
//    else
//    {
//        // TODO: According to profiler it prevents from hardware optimizations
//        //          (use transparency instead)
//        gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);
//    }
}
