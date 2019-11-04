//
//  colored_fs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 10/04/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//

precision mediump float;
varying vec4 v_Color;
void main()
{
   gl_FragColor = v_Color;
}
